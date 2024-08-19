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

public val DuotoneGroup.`Thermometer-simple-duotone`: ImageVector
    get() {
        if (`_thermometer-simple-duotone` != null) {
            return `_thermometer-simple-duotone`!!
        }
        `_thermometer-simple-duotone` = Builder(name = "Thermometer-simple-duotone", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(160.0f, 138.0f)
                lineTo(160.0f, 48.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -64.0f, 0.0f)
                verticalLineToRelative(90.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
                moveTo(128.0f, 208.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 208.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 153.0f)
                lineTo(136.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(65.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 16.0f, 0.0f)
                close()
                moveTo(128.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 200.0f)
                close()
                moveTo(168.0f, 134.0f)
                lineTo(168.0f, 48.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -80.0f, 0.0f)
                verticalLineToRelative(86.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 80.0f, 0.0f)
                close()
                moveTo(128.0f, 232.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -27.42f, -87.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 138.0f)
                lineTo(104.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 48.0f, 0.0f)
                verticalLineToRelative(90.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.42f, 6.56f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 128.0f, 232.0f)
                close()
            }
        }
        .build()
        return `_thermometer-simple-duotone`!!
    }

private var `_thermometer-simple-duotone`: ImageVector? = null
