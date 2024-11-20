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

public val LightGroup.Scooter: ImageVector
    get() {
        if (_scooter != null) {
            return _scooter!!
        }
        _scooter = Builder(name = "Scooter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 138.0f)
                arcToRelative(34.32f, 34.32f, 0.0f, false, false, -4.89f, 0.36f)
                lineTo(173.69f, 38.1f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 168.0f, 34.0f)
                lineTo(136.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(27.68f)
                lineToRelative(18.24f, 54.73f)
                lineTo(125.16f, 170.0f)
                lineTo(77.94f, 170.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, -1.44f, 12.0f)
                lineTo(128.0f, 182.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.64f, -2.2f)
                lineToRelative(53.76f, -65.62f)
                lineToRelative(9.33f, 28.0f)
                arcTo(34.0f, 34.0f, 0.0f, true, false, 212.0f, 138.0f)
                close()
                moveTo(44.0f, 194.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, -22.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 44.0f, 194.0f)
                close()
                moveTo(212.0f, 194.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, -22.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 212.0f, 194.0f)
                close()
            }
        }
        .build()
        return _scooter!!
    }

private var _scooter: ImageVector? = null
