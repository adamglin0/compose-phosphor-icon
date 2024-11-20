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

public val ThinGroup.SteeringWheel: ImageVector
    get() {
        if (_steeringWheel != null) {
            return _steeringWheel!!
        }
        _steeringWheel = Builder(name = "SteeringWheel", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 148.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 148.0f)
                close()
                moveTo(228.0f, 128.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, true, 128.0f, 28.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, true, 228.0f, 128.0f)
                close()
                moveTo(36.0f, 128.0f)
                quadToRelative(0.0f, 4.53f, 0.44f, 8.94f)
                arcToRelative(131.94f, 131.94f, 0.0f, false, true, 183.12f, 0.0f)
                quadToRelative(0.44f, -4.41f, 0.44f, -8.94f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, -184.0f, 0.0f)
                close()
                moveTo(113.75f, 218.9f)
                lineTo(94.2f, 166.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.75f, -2.6f)
                lineTo(43.34f, 164.0f)
                arcTo(92.31f, 92.31f, 0.0f, false, false, 113.75f, 218.9f)
                close()
                moveTo(128.0f, 220.0f)
                curveToRelative(1.78f, 0.0f, 3.55f, -0.06f, 5.3f, -0.16f)
                lineToRelative(21.0f, -56.05f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 165.55f, 156.0f)
                horizontalLineToRelative(50.09f)
                arcToRelative(91.61f, 91.61f, 0.0f, false, false, 2.43f, -9.21f)
                arcToRelative(124.0f, 124.0f, 0.0f, false, false, -180.14f, 0.0f)
                arcTo(91.61f, 91.61f, 0.0f, false, false, 40.36f, 156.0f)
                lineTo(90.45f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 11.24f, 7.8f)
                lineToRelative(21.0f, 56.0f)
                curveTo(124.42f, 219.94f, 126.2f, 220.0f, 128.0f, 220.0f)
                close()
                moveTo(212.66f, 164.0f)
                lineTo(165.55f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.75f, 2.6f)
                lineToRelative(-19.6f, 52.3f)
                arcTo(92.26f, 92.26f, 0.0f, false, false, 212.66f, 164.0f)
                close()
            }
        }
        .build()
        return _steeringWheel!!
    }

private var _steeringWheel: ImageVector? = null
