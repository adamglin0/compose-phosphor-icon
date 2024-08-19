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

public val ThinGroup.Foldersimplelock: ImageVector
    get() {
        if (_foldersimplelock != null) {
            return _foldersimplelock!!
        }
        _foldersimplelock = Builder(name = "Foldersimplelock", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 88.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(220.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(130.67f, 84.0f)
                arcToRelative(12.05f, 12.05f, 0.0f, false, true, -7.2f, -2.4f)
                lineTo(95.73f, 60.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.4f, -0.8f)
                lineTo(40.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(36.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(40.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(28.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 40.0f, 52.0f)
                lineTo(93.33f, 52.0f)
                arcToRelative(12.05f, 12.05f, 0.0f, false, true, 7.2f, 2.4f)
                lineToRelative(27.74f, 20.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.4f, 0.8f)
                lineTo(216.0f, 76.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 88.0f)
                close()
                moveTo(228.0f, 168.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(152.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(148.0f, 168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 48.0f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 228.0f, 168.0f)
                close()
                moveTo(172.0f, 164.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -32.0f, 0.0f)
                close()
                moveTo(220.0f, 172.0f)
                lineTo(156.0f, 172.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(64.0f)
                close()
            }
        }
        .build()
        return _foldersimplelock!!
    }

private var _foldersimplelock: ImageVector? = null
