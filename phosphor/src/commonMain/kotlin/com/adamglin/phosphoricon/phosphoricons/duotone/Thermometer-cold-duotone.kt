package com.adamglin.phosphoricon.phosphoricons.duotone

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
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Thermometer-cold-duotone`: ImageVector
    get() {
        if (`_thermometer-cold-duotone` != null) {
            return `_thermometer-cold-duotone`!!
        }
        `_thermometer-cold-duotone` = Builder(name = "Thermometer-cold-duotone", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(152.0f, 138.0f)
                lineTo(152.0f, 48.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -64.0f, 0.0f)
                verticalLineToRelative(90.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
                moveTo(120.0f, 208.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 120.0f, 208.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.91f, 77.72f)
                lineToRelative(-20.0f, 6.49f)
                lineToRelative(12.34f, 17.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.94f, 9.4f)
                lineTo(216.0f, 93.61f)
                lineToRelative(-12.34f, 17.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.94f, -9.4f)
                lineToRelative(12.34f, -17.0f)
                lineToRelative(-20.0f, -6.49f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 188.0f, 62.5f)
                lineTo(208.0f, 69.0f)
                lineTo(208.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(224.0f, 69.0f)
                lineToRelative(20.0f, -6.49f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.95f, 15.22f)
                close()
                moveTo(152.0f, 184.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -40.0f, -31.0f)
                lineTo(112.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(33.0f)
                arcTo(32.06f, 32.06f, 0.0f, false, true, 152.0f, 184.0f)
                close()
                moveTo(136.0f, 184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 136.0f, 184.0f)
                close()
                moveTo(184.0f, 184.0f)
                arcTo(64.0f, 64.0f, 0.0f, true, true, 80.0f, 134.0f)
                lineTo(80.0f, 48.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 80.0f, 0.0f)
                verticalLineToRelative(86.0f)
                arcTo(64.08f, 64.08f, 0.0f, false, true, 184.0f, 184.0f)
                close()
                moveTo(168.0f, 184.0f)
                arcToRelative(48.08f, 48.08f, 0.0f, false, false, -20.58f, -39.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 144.0f, 138.0f)
                lineTo(144.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -48.0f, 0.0f)
                verticalLineToRelative(90.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.42f, 6.56f)
                arcTo(48.0f, 48.0f, 0.0f, true, false, 168.0f, 184.0f)
                close()
            }
        }
        .build()
        return `_thermometer-cold-duotone`!!
    }

private var `_thermometer-cold-duotone`: ImageVector? = null
