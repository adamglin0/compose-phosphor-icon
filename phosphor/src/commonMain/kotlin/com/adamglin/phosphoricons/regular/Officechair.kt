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

public val RegularGroup.OfficeChair: ImageVector
    get() {
        if (_officeChair != null) {
            return _officeChair!!
        }
        _officeChair = Builder(name = "OfficeChair", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(223.33f)
                arcTo(48.08f, 48.08f, 0.0f, false, true, 176.0f, 176.0f)
                horizontalLineTo(136.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(136.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(216.0f)
                horizontalLineTo(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, -32.0f)
                horizontalLineToRelative(24.0f)
                verticalLineTo(176.0f)
                horizontalLineTo(80.0f)
                arcToRelative(48.08f, 48.08f, 0.0f, false, true, -47.33f, -40.0f)
                horizontalLineTo(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 248.0f, 128.0f)
                close()
                moveTo(67.91f, 138.48f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -3.75f, -12.74f)
                lineToRelative(13.72f, -96.0f)
                arcTo(16.08f, 16.08f, 0.0f, false, true, 93.72f, 16.0f)
                horizontalLineToRelative(68.56f)
                arcToRelative(16.08f, 16.08f, 0.0f, false, true, 15.84f, 13.74f)
                lineToRelative(13.72f, 96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 176.0f, 144.0f)
                horizontalLineTo(80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 67.91f, 138.48f)
                close()
                moveTo(80.0f, 128.0f)
                horizontalLineToRelative(96.0f)
                lineTo(162.28f, 32.0f)
                horizontalLineTo(93.71f)
                close()
            }
        }
        .build()
        return _officeChair!!
    }

private var _officeChair: ImageVector? = null
