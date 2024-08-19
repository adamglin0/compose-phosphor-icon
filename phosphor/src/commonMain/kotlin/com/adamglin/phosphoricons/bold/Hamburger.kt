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

public val BoldGroup.Hamburger: ImageVector
    get() {
        if (_hamburger != null) {
            return _hamburger!!
        }
        _hamburger = Builder(name = "Hamburger", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.9f, 152.72f)
                lineToRelative(-39.7f, 14.44f)
                lineToRelative(-35.74f, -14.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.92f, 0.0f)
                lineTo(108.0f, 167.08f)
                lineTo(72.46f, 152.86f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.56f, -0.14f)
                lineToRelative(-44.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.2f, 22.56f)
                lineToRelative(8.12f, -2.95f)
                arcTo(44.06f, 44.06f, 0.0f, false, false, 80.0f, 228.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, 44.0f, -44.0f)
                verticalLineToRelative(-2.87f)
                lineToRelative(16.1f, -5.85f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.2f, -22.56f)
                close()
                moveTo(176.0f, 204.0f)
                lineTo(80.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                verticalLineToRelative(-4.32f)
                lineToRelative(7.8f, -2.84f)
                lineToRelative(35.74f, 14.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.92f, 0.0f)
                lineTo(148.0f, 176.92f)
                lineToRelative(35.54f, 14.22f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.56f, 0.14f)
                lineToRelative(2.89f, -1.06f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 176.0f, 204.0f)
                close()
                moveTo(12.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                lineTo(232.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(24.0f, 140.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 12.0f, 128.0f)
                close()
                moveTo(48.2f, 104.0f)
                lineTo(207.8f, 104.0f)
                arcToRelative(20.36f, 20.36f, 0.0f, false, false, 16.38f, -8.29f)
                arcToRelative(19.59f, 19.59f, 0.0f, false, false, 2.88f, -17.65f)
                curveTo(216.12f, 43.88f, 175.39f, 20.0f, 128.0f, 20.0f)
                reflectiveCurveTo(39.89f, 43.87f, 28.94f, 78.05f)
                arcTo(19.56f, 19.56f, 0.0f, false, false, 31.82f, 95.7f)
                arcTo(20.32f, 20.32f, 0.0f, false, false, 48.2f, 104.0f)
                close()
                moveTo(128.0f, 44.0f)
                curveToRelative(33.7f, 0.0f, 63.61f, 14.85f, 74.0f, 36.0f)
                lineTo(54.0f, 80.0f)
                curveTo(64.4f, 58.85f, 94.31f, 44.0f, 128.0f, 44.0f)
                close()
            }
        }
        .build()
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
