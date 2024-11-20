package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Bug: ImageVector
    get() {
        if (_bug != null) {
            return _bug!!
        }
        _bug = Builder(name = "Bug", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 144.0f, 92.0f)
                close()
                moveTo(100.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 100.0f, 80.0f)
                close()
                moveTo(216.0f, 144.0f)
                arcTo(87.76f, 87.76f, 0.0f, false, true, 213.0f, 167.0f)
                lineToRelative(22.24f, 9.72f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 192.0f)
                arcToRelative(7.89f, 7.89f, 0.0f, false, true, -3.2f, -0.67f)
                lineTo(207.38f, 182.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, -158.76f, 0.0f)
                lineTo(27.2f, 191.33f)
                arcTo(7.89f, 7.89f, 0.0f, false, true, 24.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.2f, -15.33f)
                lineTo(43.0f, 167.0f)
                arcTo(87.76f, 87.76f, 0.0f, false, true, 40.0f, 144.0f)
                verticalLineToRelative(-8.0f)
                lineTo(16.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(40.0f, 120.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(87.76f, 87.76f, 0.0f, false, true, 3.0f, -23.0f)
                lineTo(20.8f, 79.33f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 6.4f, -14.66f)
                lineTo(48.62f, 74.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, 158.76f, 0.0f)
                lineToRelative(21.42f, -9.36f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.4f, 14.66f)
                lineTo(213.0f, 89.05f)
                arcToRelative(87.76f, 87.76f, 0.0f, false, true, 3.0f, 23.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(216.0f, 136.05f)
                close()
                moveTo(56.0f, 120.0f)
                lineTo(200.0f, 120.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, -144.0f, 0.0f)
                close()
                moveTo(120.0f, 215.54f)
                lineTo(120.0f, 136.0f)
                lineTo(56.0f, 136.0f)
                verticalLineToRelative(8.0f)
                arcTo(72.08f, 72.08f, 0.0f, false, false, 120.0f, 215.54f)
                close()
                moveTo(200.0f, 144.0f)
                verticalLineToRelative(-8.0f)
                lineTo(136.0f, 136.0f)
                verticalLineToRelative(79.54f)
                arcTo(72.08f, 72.08f, 0.0f, false, false, 200.0f, 144.0f)
                close()
            }
        }
        .build()
        return _bug!!
    }

private var _bug: ImageVector? = null
