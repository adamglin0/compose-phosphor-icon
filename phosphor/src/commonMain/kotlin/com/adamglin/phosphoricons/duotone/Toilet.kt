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

public val DuotoneGroup.Toilet: ImageVector
    get() {
        if (_toilet != null) {
            return _toilet!!
        }
        _toilet = Builder(name = "Toilet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(167.92f, 222.87f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 232.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.92f, -9.13f)
                lineToRelative(4.34f, -30.36f)
                horizontalLineToRelative(0.0f)
                arcToRelative(88.21f, 88.21f, 0.0f, false, false, 71.14f, 0.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(184.0f, 32.0f)
                horizontalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(72.0f)
                horizontalLineTo(192.0f)
                verticalLineTo(40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 184.0f, 32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(96.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 64.0f)
                close()
                moveTo(172.32f, 197.14f)
                lineTo(175.84f, 221.74f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 160.0f, 240.0f)
                lineTo(96.0f, 240.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -15.84f, -18.26f)
                lineToRelative(3.52f, -24.6f)
                arcTo(96.09f, 96.09f, 0.0f, false, true, 32.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(56.0f, 104.0f)
                lineTo(56.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 72.0f, 24.0f)
                lineTo(184.0f, 24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                arcTo(96.09f, 96.09f, 0.0f, false, true, 172.32f, 197.14f)
                close()
                moveTo(72.0f, 104.0f)
                lineTo(184.0f, 104.0f)
                lineTo(184.0f, 40.0f)
                lineTo(72.0f, 40.0f)
                close()
                moveTo(157.07f, 203.5f)
                arcToRelative(96.15f, 96.15f, 0.0f, false, true, -58.14f, 0.0f)
                lineTo(96.0f, 224.0f)
                horizontalLineToRelative(64.0f)
                close()
                moveTo(207.6f, 120.0f)
                lineTo(48.4f, 120.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 159.2f, 0.0f)
                close()
            }
        }
        .build()
        return _toilet!!
    }

private var _toilet: ImageVector? = null
