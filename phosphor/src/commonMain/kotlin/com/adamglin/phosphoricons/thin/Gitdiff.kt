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

public val ThinGroup.GitDiff: ImageVector
    get() {
        if (_gitDiff != null) {
            return _gitDiff!!
        }
        _gitDiff = Builder(name = "GitDiff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(38.34f)
                lineTo(63.51f, 153.86f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 60.0f, 145.37f)
                verticalLineTo(91.71f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -8.0f, 0.0f)
                verticalLineToRelative(53.66f)
                arcToRelative(19.85f, 19.85f, 0.0f, false, false, 5.86f, 14.14f)
                lineTo(102.34f, 204.0f)
                horizontalLineTo(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(160.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 112.0f, 156.0f)
                close()
                moveTo(36.0f, 64.0f)
                arcTo(20.0f, 20.0f, 0.0f, true, true, 56.0f, 84.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 36.0f, 64.0f)
                close()
                moveTo(204.0f, 164.29f)
                verticalLineTo(110.63f)
                arcToRelative(19.85f, 19.85f, 0.0f, false, false, -5.86f, -14.14f)
                lineTo(153.66f, 52.0f)
                horizontalLineTo(192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineTo(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(57.66f)
                lineToRelative(44.49f, 44.48f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.51f, 8.49f)
                verticalLineToRelative(53.66f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 8.0f, 0.0f)
                close()
                moveTo(200.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 200.0f, 212.0f)
                close()
            }
        }
        .build()
        return _gitDiff!!
    }

private var _gitDiff: ImageVector? = null
