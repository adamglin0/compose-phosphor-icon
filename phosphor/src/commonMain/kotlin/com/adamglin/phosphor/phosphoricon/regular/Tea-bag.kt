package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Tea-bag`: ImageVector
    get() {
        if (`_tea-bag` != null) {
            return `_tea-bag`!!
        }
        `_tea-bag` = Builder(name = "Tea-bag", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(64.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 96.0f, 64.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(76.53f)
                arcToRelative(16.09f, 16.09f, 0.0f, false, false, -13.72f, 7.77f)
                lineTo(42.28f, 114.0f)
                arcTo(16.06f, 16.06f, 0.0f, false, false, 40.0f, 122.22f)
                verticalLineTo(216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(122.22f)
                arcToRelative(16.06f, 16.06f, 0.0f, false, false, -2.28f, -8.24f)
                lineTo(145.19f, 79.77f)
                arcTo(16.09f, 16.09f, 0.0f, false, false, 131.47f, 72.0f)
                horizontalLineTo(112.0f)
                verticalLineTo(64.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 80.0f, 0.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(131.47f, 88.0f)
                lineTo(152.0f, 122.22f)
                verticalLineTo(216.0f)
                horizontalLineTo(56.0f)
                verticalLineTo(122.22f)
                lineTo(76.53f, 88.0f)
                horizontalLineTo(96.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(88.0f)
                close()
            }
        }
        .build()
        return `_tea-bag`!!
    }

private var `_tea-bag`: ImageVector? = null
