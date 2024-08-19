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

public val RegularGroup.Treasurechest: ImageVector
    get() {
        if (_treasurechest != null) {
            return _treasurechest!!
        }
        _treasurechest = Builder(name = "Treasurechest", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 40.0f)
                lineTo(72.0f, 40.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, false, 16.0f, 96.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(224.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(240.0f, 96.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, false, 184.0f, 40.0f)
                close()
                moveTo(224.0f, 96.0f)
                verticalLineToRelative(8.0f)
                lineTo(192.0f, 104.0f)
                lineTo(192.0f, 56.8f)
                arcTo(40.07f, 40.07f, 0.0f, false, true, 224.0f, 96.0f)
                close()
                moveTo(136.0f, 136.0f)
                lineTo(120.0f, 136.0f)
                lineTo(120.0f, 104.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(112.0f, 152.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(152.0f, 120.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(72.0f)
                lineTo(80.0f, 192.0f)
                lineTo(80.0f, 120.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 112.0f, 152.0f)
                close()
                moveTo(152.0f, 104.0f)
                lineTo(152.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(112.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(8.0f)
                lineTo(80.0f, 104.0f)
                lineTo(80.0f, 56.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(48.0f)
                close()
                moveTo(64.0f, 56.8f)
                lineTo(64.0f, 104.0f)
                lineTo(32.0f, 104.0f)
                lineTo(32.0f, 96.0f)
                arcTo(40.07f, 40.07f, 0.0f, false, true, 64.0f, 56.8f)
                close()
                moveTo(32.0f, 120.0f)
                lineTo(64.0f, 120.0f)
                verticalLineToRelative(72.0f)
                lineTo(32.0f, 192.0f)
                close()
                moveTo(224.0f, 192.0f)
                lineTo(192.0f, 192.0f)
                lineTo(192.0f, 120.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(72.0f)
                close()
            }
        }
        .build()
        return _treasurechest!!
    }

private var _treasurechest: ImageVector? = null
