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

public val BoldGroup.Cow: ImageVector
    get() {
        if (_cow != null) {
            return _cow!!
        }
        _cow = Builder(name = "Cow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 120.0f, 128.0f)
                close()
                moveTo(152.0f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 152.0f, 112.0f)
                close()
                moveTo(247.48f, 124.66f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 232.0f, 132.0f)
                lineTo(204.0f, 132.0f)
                verticalLineToRelative(35.05f)
                arcTo(38.0f, 38.0f, 0.0f, false, true, 182.0f, 236.0f)
                lineTo(74.0f, 236.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, true, -22.0f, -68.95f)
                lineTo(52.0f, 132.0f)
                lineTo(24.0f, 132.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 4.39f, 108.17f)
                arcToRelative(60.15f, 60.15f, 0.0f, false, true, 52.0f, -47.76f)
                arcTo(59.7f, 59.7f, 0.0f, false, true, 44.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, -36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                arcToRelative(59.7f, 59.7f, 0.0f, false, true, -12.35f, 36.41f)
                arcToRelative(60.15f, 60.15f, 0.0f, false, true, 52.0f, 47.76f)
                arcTo(19.78f, 19.78f, 0.0f, false, true, 247.48f, 124.66f)
                close()
                moveTo(76.0f, 160.0f)
                lineTo(180.0f, 160.0f)
                lineTo(180.0f, 104.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(96.0f, 84.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                close()
                moveTo(56.5f, 84.64f)
                arcTo(36.15f, 36.15f, 0.0f, false, false, 29.26f, 108.0f)
                lineTo(52.0f, 108.0f)
                verticalLineToRelative(-4.0f)
                arcTo(43.71f, 43.71f, 0.0f, false, true, 56.5f, 84.64f)
                close()
                moveTo(196.0f, 198.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(74.0f, 184.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 28.0f)
                lineTo(182.0f, 212.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 196.0f, 198.0f)
                close()
                moveTo(226.74f, 108.0f)
                arcTo(36.15f, 36.15f, 0.0f, false, false, 199.5f, 84.64f)
                arcTo(43.71f, 43.71f, 0.0f, false, true, 204.0f, 104.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _cow!!
    }

private var _cow: ImageVector? = null
