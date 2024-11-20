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

public val RegularGroup.ListHeart: ImageVector
    get() {
        if (_listHeart != null) {
            return _listHeart!!
        }
        _listHeart = Builder(name = "ListHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(216.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(40.0f, 72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 32.0f, 64.0f)
                close()
                moveTo(40.0f, 136.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(40.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(120.0f, 184.0f)
                lineTo(40.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(248.0f, 144.0f)
                curveToRelative(0.0f, 36.52f, -50.28f, 62.08f, -52.42f, 63.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.16f, 0.0f)
                curveTo(186.28f, 206.08f, 136.0f, 180.52f, 136.0f, 144.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 56.0f, -21.14f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 248.0f, 144.0f)
                close()
                moveTo(232.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -32.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -32.0f, 0.0f)
                curveToRelative(0.0f, 20.18f, 26.21f, 39.14f, 40.0f, 46.93f)
                curveTo(205.79f, 183.15f, 232.0f, 164.19f, 232.0f, 144.0f)
                close()
            }
        }
        .build()
        return _listHeart!!
    }

private var _listHeart: ImageVector? = null
