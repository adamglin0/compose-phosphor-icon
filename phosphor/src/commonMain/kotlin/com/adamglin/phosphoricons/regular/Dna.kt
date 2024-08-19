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

public val RegularGroup.Dna: ImageVector
    get() {
        if (_dna != null) {
            return _dna!!
        }
        _dna = Builder(name = "Dna", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 204.5f)
                verticalLineTo(232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(204.5f)
                arcToRelative(63.67f, 63.67f, 0.0f, false, false, -35.38f, -57.25f)
                lineToRelative(-48.4f, -24.19f)
                arcTo(79.58f, 79.58f, 0.0f, false, true, 56.0f, 51.5f)
                verticalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineTo(51.5f)
                arcToRelative(63.67f, 63.67f, 0.0f, false, false, 35.38f, 57.25f)
                lineToRelative(48.4f, 24.19f)
                arcTo(79.58f, 79.58f, 0.0f, false, true, 200.0f, 204.5f)
                close()
                moveTo(160.0f, 200.0f)
                horizontalLineTo(72.17f)
                arcToRelative(63.59f, 63.59f, 0.0f, false, true, 3.23f, -16.0f)
                horizontalLineToRelative(72.71f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(83.46f)
                arcToRelative(63.71f, 63.71f, 0.0f, false, true, 14.65f, -15.08f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 88.64f, 140.0f)
                arcTo(80.27f, 80.27f, 0.0f, false, false, 56.0f, 204.5f)
                verticalLineTo(232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(216.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(192.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineTo(40.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(87.83f)
                arcToRelative(63.59f, 63.59f, 0.0f, false, true, -3.23f, 16.0f)
                horizontalLineTo(107.89f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f)
                horizontalLineToRelative(64.65f)
                arcToRelative(63.71f, 63.71f, 0.0f, false, true, -14.65f, 15.08f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.47f, 12.9f)
                arcTo(80.27f, 80.27f, 0.0f, false, false, 200.0f, 51.5f)
                verticalLineTo(24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 16.0f)
                close()
            }
        }
        .build()
        return _dna!!
    }

private var _dna: ImageVector? = null
