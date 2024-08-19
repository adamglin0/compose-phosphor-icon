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

public val DuotoneGroup.Plugcharging: ImageVector
    get() {
        if (_plugcharging != null) {
            return _plugcharging!!
        }
        _plugcharging = Builder(name = "Plugcharging", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(200.0f, 64.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                horizontalLineTo(88.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, -32.0f)
                verticalLineTo(64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 56.0f)
                lineTo(176.0f, 56.0f)
                lineTo(176.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(160.0f, 56.0f)
                lineTo(96.0f, 56.0f)
                lineTo(96.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(80.0f, 56.0f)
                lineTo(32.55f, 56.0f)
                curveTo(26.28f, 56.0f, 24.0f, 60.78f, 24.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(48.0f, 72.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 200.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, -40.0f)
                lineTo(208.0f, 72.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(192.0f, 160.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f)
                lineTo(88.0f, 184.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                lineTo(64.0f, 72.0f)
                lineTo(192.0f, 72.0f)
                close()
                moveTo(105.42f, 132.56f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.91f, -7.37f)
                lineToRelative(12.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.0f, 5.62f)
                lineToRelative(-8.0f, 21.19f)
                lineTo(144.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.49f, 10.81f)
                lineToRelative(-12.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.0f, -5.62f)
                lineToRelative(8.0f, -21.19f)
                lineTo(112.0f, 136.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 105.42f, 132.56f)
                close()
            }
        }
        .build()
        return _plugcharging!!
    }

private var _plugcharging: ImageVector? = null
