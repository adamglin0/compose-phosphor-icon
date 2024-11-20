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

public val RegularGroup.MouseMiddleClick: ImageVector
    get() {
        if (_mouseMiddleClick != null) {
            return _mouseMiddleClick!!
        }
        _mouseMiddleClick = Builder(name = "MouseMiddleClick", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 16.0f)
                lineTo(112.0f, 16.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 48.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, 64.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, -64.0f)
                lineTo(208.0f, 80.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 144.0f, 16.0f)
                close()
                moveTo(192.0f, 80.0f)
                verticalLineToRelative(24.0f)
                lineTo(152.0f, 104.0f)
                lineTo(152.0f, 88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(136.0f, 32.0f)
                horizontalLineToRelative(8.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 192.0f, 80.0f)
                close()
                moveTo(136.0f, 136.0f)
                lineTo(120.0f, 136.0f)
                lineTo(120.0f, 88.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(23.9f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, false, 0.0f, 0.2f)
                close()
                moveTo(112.0f, 32.0f)
                horizontalLineToRelative(8.0f)
                lineTo(120.0f, 72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                lineTo(64.0f, 104.0f)
                lineTo(64.0f, 80.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 112.0f, 32.0f)
                close()
                moveTo(144.0f, 224.0f)
                lineTo(112.0f, 224.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, true, -48.0f, -48.0f)
                lineTo(64.0f, 120.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(152.0f, 120.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(56.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 144.0f, 224.0f)
                close()
            }
        }
        .build()
        return _mouseMiddleClick!!
    }

private var _mouseMiddleClick: ImageVector? = null
