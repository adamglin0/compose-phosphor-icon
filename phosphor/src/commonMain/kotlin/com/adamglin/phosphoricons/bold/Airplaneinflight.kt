package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Airplaneinflight: ImageVector
    get() {
        if (_airplaneinflight != null) {
            return _airplaneinflight!!
        }
        _airplaneinflight = Builder(name = "Airplaneinflight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(72.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(216.0f, 204.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 216.0f)
                close()
                moveTo(252.0f, 136.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(61.07f, 172.0f)
                arcToRelative(43.72f, 43.72f, 0.0f, false, true, -42.14f, -31.36f)
                lineTo(4.86f, 93.75f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 24.0f, 68.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 8.48f, 3.51f)
                lineTo(61.0f, 92.0f)
                lineTo(76.27f, 92.0f)
                lineTo(69.0f, 70.32f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 88.0f, 44.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 8.48f, 3.51f)
                lineTo(149.0f, 92.0f)
                horizontalLineToRelative(59.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, true, 252.0f, 136.0f)
                close()
                moveTo(228.0f, 136.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(144.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.48f, -3.51f)
                lineTo(94.83f, 71.79f)
                lineToRelative(9.47f, 28.42f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 92.91f, 116.0f)
                lineTo(56.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.49f, -3.51f)
                lineTo(30.4f, 95.36f)
                lineToRelative(11.51f, 38.39f)
                arcTo(19.89f, 19.89f, 0.0f, false, false, 61.07f, 148.0f)
                lineTo(228.0f, 148.0f)
                close()
            }
        }
        .build()
        return _airplaneinflight!!
    }

private var _airplaneinflight: ImageVector? = null
