package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Caretdoubleright: ImageVector
    get() {
        if (_caretdoubleright != null) {
            return _caretdoubleright!!
        }
        _caretdoubleright = Builder(name = "Caretdoubleright", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.24f, 132.24f)
                lineToRelative(-80.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineTo(127.51f, 128.0f)
                lineTo(51.76f, 52.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineToRelative(80.0f, 80.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 140.24f, 132.24f)
                close()
                moveTo(220.24f, 123.76f)
                lineTo(140.24f, 43.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                lineTo(207.51f, 128.0f)
                lineToRelative(-75.75f, 75.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f)
                lineToRelative(80.0f, -80.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 220.24f, 123.76f)
                close()
            }
        }
        .build()
        return _caretdoubleright!!
    }

private var _caretdoubleright: ImageVector? = null
