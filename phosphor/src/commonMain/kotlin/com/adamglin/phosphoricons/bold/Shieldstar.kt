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

public val BoldGroup.ShieldStar: ImageVector
    get() {
        if (_shieldStar != null) {
            return _shieldStar!!
        }
        _shieldStar = Builder(name = "ShieldStar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(76.86f, 115.54f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 15.6f, -6.68f)
                lineTo(116.0f, 118.28f)
                lineTo(116.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(22.28f)
                lineToRelative(23.54f, -9.42f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 8.92f, 22.28f)
                lineTo(147.0f, 141.33f)
                lineTo(161.6f, 160.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -19.2f, 14.4f)
                lineTo(128.0f, 156.0f)
                lineToRelative(-14.4f, 19.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -19.2f, -14.4f)
                lineTo(109.0f, 141.33f)
                lineTo(83.54f, 131.14f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 76.86f, 115.54f)
                close()
                moveTo(228.0f, 56.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 54.29f, -26.32f, 87.22f, -48.4f, 105.29f)
                curveToRelative(-23.71f, 19.39f, -47.44f, 26.0f, -48.44f, 26.29f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -6.32f, 0.0f)
                curveToRelative(-1.0f, -0.28f, -24.73f, -6.9f, -48.44f, -26.29f)
                curveTo(54.32f, 199.22f, 28.0f, 166.29f, 28.0f, 112.0f)
                lineTo(28.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 48.0f, 36.0f)
                lineTo(208.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 228.0f, 56.0f)
                close()
                moveTo(204.0f, 60.0f)
                lineTo(52.0f, 60.0f)
                verticalLineToRelative(52.0f)
                curveToRelative(0.0f, 35.71f, 13.09f, 64.69f, 38.91f, 86.15f)
                arcTo(126.14f, 126.14f, 0.0f, false, false, 128.0f, 219.38f)
                arcToRelative(126.28f, 126.28f, 0.0f, false, false, 37.09f, -21.23f)
                curveTo(190.91f, 176.69f, 204.0f, 147.71f, 204.0f, 112.0f)
                close()
            }
        }
        .build()
        return _shieldStar!!
    }

private var _shieldStar: ImageVector? = null
