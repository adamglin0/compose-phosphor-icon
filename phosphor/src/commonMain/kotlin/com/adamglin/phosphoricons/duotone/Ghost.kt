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

public val DuotoneGroup.Ghost: ImageVector
    get() {
        if (_ghost != null) {
            return _ghost!!
        }
        _ghost = Builder(name = "Ghost", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 120.0f)
                verticalLineToRelative(96.0f)
                lineToRelative(-29.33f, -24.0f)
                lineToRelative(-29.34f, 24.0f)
                lineTo(128.0f, 192.0f)
                lineTo(98.67f, 216.0f)
                lineTo(69.33f, 192.0f)
                lineTo(40.0f, 216.0f)
                verticalLineTo(120.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, 176.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 112.0f, 116.0f)
                close()
                moveTo(156.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 156.0f, 104.0f)
                close()
                moveTo(224.0f, 120.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.07f, 6.19f)
                lineToRelative(-24.26f, -19.85f)
                lineTo(162.4f, 222.19f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.13f, 0.0f)
                lineTo(128.0f, 202.34f)
                lineToRelative(-24.27f, 19.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.13f, 0.0f)
                lineTo(69.33f, 202.34f)
                lineTo(45.07f, 222.19f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 32.0f, 216.0f)
                lineTo(32.0f, 120.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, 192.0f, 0.0f)
                close()
                moveTo(208.0f, 120.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, -160.0f, 0.0f)
                verticalLineToRelative(79.12f)
                lineToRelative(16.27f, -13.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.13f, 0.0f)
                lineToRelative(24.27f, 19.85f)
                lineToRelative(24.26f, -19.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.14f, 0.0f)
                lineToRelative(24.26f, 19.85f)
                lineToRelative(24.27f, -19.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.13f, 0.0f)
                lineTo(208.0f, 199.12f)
                close()
            }
        }
        .build()
        return _ghost!!
    }

private var _ghost: ImageVector? = null
