package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Caretdoubleright: ImageVector
    get() {
        if (_caretdoubleright != null) {
            return _caretdoubleright!!
        }
        _caretdoubleright = Builder(name = "Caretdoubleright", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(138.83f, 130.83f)
                lineToRelative(-80.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineTo(130.34f, 128.0f)
                lineTo(53.17f, 50.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineToRelative(80.0f, 80.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 138.83f, 130.83f)
                close()
                moveTo(218.83f, 125.17f)
                lineTo(138.83f, 45.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                lineTo(210.34f, 128.0f)
                lineToRelative(-77.17f, 77.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f)
                lineToRelative(80.0f, -80.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 218.83f, 125.17f)
                close()
            }
        }
        .build()
        return _caretdoubleright!!
    }

private var _caretdoubleright: ImageVector? = null
