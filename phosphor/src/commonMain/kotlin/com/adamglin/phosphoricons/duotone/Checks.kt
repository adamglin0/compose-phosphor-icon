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

public val DuotoneGroup.Checks: ImageVector
    get() {
        if (_checks != null) {
            return _checks!!
        }
        _checks = Builder(name = "Checks", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(240.0f, 64.0f)
                verticalLineTo(192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 32.0f, 48.0f)
                horizontalLineTo(224.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 240.0f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(149.61f, 85.71f)
                lineToRelative(-89.6f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.22f, 0.0f)
                lineTo(10.39f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.22f, -11.41f)
                lineTo(54.4f, 156.79f)
                lineToRelative(84.0f, -82.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.22f, 11.42f)
                close()
                moveTo(245.71f, 74.39f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -0.1f)
                lineToRelative(-84.0f, 82.5f)
                lineToRelative(-18.83f, -18.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.21f, 11.42f)
                lineToRelative(24.43f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.22f, 0.0f)
                lineToRelative(89.6f, -88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 245.71f, 74.39f)
                close()
            }
        }
        .build()
        return _checks!!
    }

private var _checks: ImageVector? = null
