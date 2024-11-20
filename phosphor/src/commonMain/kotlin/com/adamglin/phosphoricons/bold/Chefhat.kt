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

public val BoldGroup.ChefHat: ImageVector
    get() {
        if (_chefHat != null) {
            return _chefHat!!
        }
        _chefHat = Builder(name = "ChefHat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 112.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, false, -60.0f, -60.0f)
                curveToRelative(-1.0f, 0.0f, -1.95f, 0.0f, -2.92f, 0.08f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, -106.16f, 0.0f)
                curveTo(74.0f, 52.0f, 73.0f, 52.0f, 72.0f, 52.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 44.0f, 165.0f)
                verticalLineToRelative(43.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(192.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(212.0f, 165.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 244.0f, 112.0f)
                close()
                moveTo(188.0f, 204.0f)
                lineTo(68.0f, 204.0f)
                lineTo(68.0f, 171.85f)
                curveToRelative(1.32f, 0.09f, 2.65f, 0.15f, 4.0f, 0.15f)
                lineTo(184.0f, 172.0f)
                curveToRelative(1.35f, 0.0f, 2.68f, -0.06f, 4.0f, -0.15f)
                close()
                moveTo(184.0f, 148.0f)
                horizontalLineToRelative(-8.63f)
                lineToRelative(4.27f, -17.09f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -23.28f, -5.82f)
                lineTo(150.63f, 148.0f)
                lineTo(140.0f, 148.0f)
                lineTo(140.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(20.0f)
                lineTo(105.37f, 148.0f)
                lineToRelative(-5.73f, -22.91f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -23.28f, 5.82f)
                lineTo(80.63f, 148.0f)
                lineTo(72.0f, 148.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -3.87f, -71.79f)
                curveTo(68.05f, 77.47f, 68.0f, 78.73f, 68.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 72.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                curveToRelative(0.0f, -1.27f, -0.05f, -2.53f, -0.13f, -3.79f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 184.0f, 148.0f)
                close()
            }
        }
        .build()
        return _chefHat!!
    }

private var _chefHat: ImageVector? = null
