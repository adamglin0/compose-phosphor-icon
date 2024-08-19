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

public val DuotoneGroup.Linkedinlogo: ImageVector
    get() {
        if (_linkedinlogo != null) {
            return _linkedinlogo!!
        }
        _linkedinlogo = Builder(name = "Linkedinlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 40.0f)
                verticalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 40.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 24.0f)
                lineTo(40.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 40.0f)
                lineTo(24.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(216.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 24.0f)
                close()
                moveTo(216.0f, 216.0f)
                lineTo(40.0f, 216.0f)
                lineTo(40.0f, 40.0f)
                lineTo(216.0f, 40.0f)
                lineTo(216.0f, 216.0f)
                close()
                moveTo(96.0f, 112.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(80.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(184.0f, 140.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(168.0f, 140.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -40.0f, 0.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(112.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.79f, -1.78f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 184.0f, 140.0f)
                close()
                moveTo(100.0f, 84.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 88.0f, 72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 100.0f, 84.0f)
                close()
            }
        }
        .build()
        return _linkedinlogo!!
    }

private var _linkedinlogo: ImageVector? = null
