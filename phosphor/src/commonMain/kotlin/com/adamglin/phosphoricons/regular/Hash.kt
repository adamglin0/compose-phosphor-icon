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

public val RegularGroup.Hash: ImageVector
    get() {
        if (_hash != null) {
            return _hash!!
        }
        _hash = Builder(name = "Hash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 88.0f)
                lineTo(175.4f, 88.0f)
                lineToRelative(8.47f, -46.57f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.74f, -2.86f)
                lineToRelative(-9.0f, 49.43f)
                lineTo(111.4f, 88.0f)
                lineToRelative(8.47f, -46.57f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.74f, -2.86f)
                lineTo(95.14f, 88.0f)
                lineTo(48.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(92.23f, 104.0f)
                lineTo(83.5f, 152.0f)
                lineTo(32.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(80.6f, 168.0f)
                lineToRelative(-8.47f, 46.57f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.44f, 9.3f)
                arcTo(7.79f, 7.79f, 0.0f, false, false, 80.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.86f, -6.57f)
                lineToRelative(9.0f, -49.43f)
                lineTo(144.6f, 168.0f)
                lineToRelative(-8.47f, 46.57f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.44f, 9.3f)
                arcTo(7.79f, 7.79f, 0.0f, false, false, 144.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.86f, -6.57f)
                lineToRelative(9.0f, -49.43f)
                lineTo(208.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(163.77f, 152.0f)
                lineToRelative(8.73f, -48.0f)
                lineTo(224.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(147.5f, 152.0f)
                lineTo(99.77f, 152.0f)
                lineToRelative(8.73f, -48.0f)
                horizontalLineToRelative(47.73f)
                close()
            }
        }
        .build()
        return _hash!!
    }

private var _hash: ImageVector? = null
