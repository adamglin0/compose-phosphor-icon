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

public val DuotoneGroup.Solarroof: ImageVector
    get() {
        if (_solarroof != null) {
            return _solarroof!!
        }
        _solarroof = Builder(name = "Solarroof", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(240.0f, 128.0f)
                horizontalLineTo(96.0f)
                lineTo(56.0f, 48.0f)
                horizontalLineTo(200.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.16f, 124.42f)
                lineToRelative(-40.0f, -80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 40.0f)
                lineTo(56.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.16f, 4.42f)
                lineToRelative(-40.0f, 80.0f)
                arcTo(8.08f, 8.08f, 0.0f, false, false, 8.0f, 128.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(232.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(248.0f, 128.0f)
                arcTo(8.08f, 8.08f, 0.0f, false, false, 247.16f, 124.42f)
                close()
                moveTo(99.06f, 56.0f)
                lineToRelative(12.0f, 24.0f)
                lineTo(80.94f, 80.0f)
                lineToRelative(-12.0f, -24.0f)
                close()
                moveTo(147.06f, 56.0f)
                lineTo(159.06f, 80.0f)
                lineTo(128.94f, 80.0f)
                lineToRelative(-12.0f, -24.0f)
                close()
                moveTo(100.94f, 120.0f)
                lineTo(88.94f, 96.0f)
                horizontalLineToRelative(30.12f)
                lineToRelative(12.0f, 24.0f)
                close()
                moveTo(148.94f, 120.0f)
                lineTo(136.94f, 96.0f)
                horizontalLineToRelative(30.12f)
                lineToRelative(12.0f, 24.0f)
                close()
                moveTo(196.94f, 120.0f)
                lineTo(184.94f, 96.0f)
                horizontalLineToRelative(30.12f)
                lineToRelative(12.0f, 24.0f)
                close()
                moveTo(207.06f, 80.0f)
                lineTo(176.94f, 80.0f)
                lineToRelative(-12.0f, -24.0f)
                horizontalLineToRelative(30.12f)
                close()
                moveTo(24.0f, 129.89f)
                lineToRelative(32.0f, -64.0f)
                lineToRelative(32.0f, 64.0f)
                lineTo(88.0f, 184.0f)
                lineTo(24.0f, 184.0f)
                close()
                moveTo(104.0f, 184.0f)
                lineTo(104.0f, 136.0f)
                lineTo(232.0f, 136.0f)
                verticalLineToRelative(48.0f)
                close()
            }
        }
        .build()
        return _solarroof!!
    }

private var _solarroof: ImageVector? = null
