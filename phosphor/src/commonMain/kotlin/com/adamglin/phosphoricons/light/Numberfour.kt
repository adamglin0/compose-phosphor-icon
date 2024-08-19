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

public val LightGroup.Numberfour: ImageVector
    get() {
        if (_numberfour != null) {
            return _numberfour!!
        }
        _numberfour = Builder(name = "Numberfour", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 162.0f)
                lineTo(166.0f, 162.0f)
                lineTo(166.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.69f, -3.75f)
                lineToRelative(-96.0f, 120.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 64.0f, 174.0f)
                horizontalLineToRelative(90.0f)
                verticalLineToRelative(34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(166.0f, 174.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(154.0f, 162.0f)
                lineTo(76.48f, 162.0f)
                lineTo(154.0f, 65.1f)
                close()
            }
        }
        .build()
        return _numberfour!!
    }

private var _numberfour: ImageVector? = null
