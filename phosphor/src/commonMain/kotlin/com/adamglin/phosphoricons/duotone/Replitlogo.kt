package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.ReplitLogo: ImageVector
    get() {
        if (_replitLogo != null) {
            return _replitLogo!!
        }
        _replitLogo = Builder(name = "ReplitLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(72.0f, 160.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(168.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 72.0f, 160.0f)
                close()
                moveTo(216.0f, 96.0f)
                horizontalLineTo(144.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(104.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 96.0f)
                close()
                moveTo(136.0f, 32.0f)
                horizontalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(72.0f)
                verticalLineTo(40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 136.0f, 32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 88.0f)
                lineTo(152.0f, 88.0f)
                lineTo(152.0f, 40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(72.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 40.0f)
                lineTo(56.0f, 88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(48.0f)
                lineTo(72.0f, 152.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(152.0f, 168.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 104.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 88.0f)
                close()
                moveTo(136.0f, 216.0f)
                lineTo(72.0f, 216.0f)
                lineTo(72.0f, 168.0f)
                horizontalLineToRelative(64.0f)
                close()
                moveTo(136.0f, 40.0f)
                lineTo(136.0f, 88.0f)
                lineTo(72.0f, 88.0f)
                lineTo(72.0f, 40.0f)
                horizontalLineToRelative(64.0f)
                close()
                moveTo(216.0f, 152.0f)
                lineTo(152.0f, 152.0f)
                lineTo(152.0f, 104.0f)
                horizontalLineToRelative(64.0f)
                close()
            }
        }
        .build()
        return _replitLogo!!
    }

private var _replitLogo: ImageVector? = null
