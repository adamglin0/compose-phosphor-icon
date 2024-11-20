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

public val ThinGroup.FilePpt: ImageVector
    get() {
        if (_filePpt != null) {
            return _filePpt!!
        }
        _filePpt = Builder(name = "FilePpt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(200.0f, 156.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(192.0f, 156.0f)
                lineTo(176.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 152.0f)
                close()
                moveTo(88.0f, 172.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f)
                lineTo(52.0f, 196.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(44.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(64.0f, 148.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 88.0f, 172.0f)
                close()
                moveTo(80.0f, 172.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(52.0f, 156.0f)
                verticalLineToRelative(32.0f)
                lineTo(64.0f, 188.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 80.0f, 172.0f)
                close()
                moveTo(156.0f, 172.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f)
                lineTo(120.0f, 196.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(112.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(16.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 156.0f, 172.0f)
                close()
                moveTo(148.0f, 172.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(120.0f, 156.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(12.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 148.0f, 172.0f)
                close()
                moveTo(44.0f, 112.0f)
                lineTo(44.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.0f, 28.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.83f, 1.17f)
                lineToRelative(56.0f, 56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 212.0f, 88.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(204.0f, 92.0f)
                lineTo(152.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(148.0f, 36.0f)
                lineTo(56.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(156.0f, 84.0f)
                horizontalLineToRelative(42.34f)
                lineTo(156.0f, 41.65f)
                close()
            }
        }
        .build()
        return _filePpt!!
    }

private var _filePpt: ImageVector? = null
