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

public val DuotoneGroup.`Air-traffic-control-duotone`: ImageVector
    get() {
        if (`_air-traffic-control-duotone` != null) {
            return `_air-traffic-control-duotone`!!
        }
        `_air-traffic-control-duotone` = Builder(name = "Air-traffic-control-duotone", defaultWidth
                = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(223.51f, 82.73f)
                lineToRelative(-26.18f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.52f, 5.27f)
                horizontalLineTo(66.19f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.52f, -5.27f)
                lineToRelative(-26.18f, -72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 40.0f, 72.0f)
                horizontalLineTo(216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 223.51f, 82.73f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.11f, 70.82f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 64.0f)
                lineTo(136.0f, 64.0f)
                lineTo(136.0f, 32.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(104.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                lineTo(120.0f, 64.0f)
                lineTo(40.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 25.0f, 85.47f)
                lineToRelative(26.19f, 72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.0f, 10.53f)
                lineTo(96.0f, 168.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(112.0f, 168.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(160.0f, 168.0f)
                horizontalLineToRelative(29.82f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.0f, -10.53f)
                lineToRelative(26.19f, -72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 229.11f, 70.82f)
                close()
                moveTo(110.68f, 152.0f)
                lineTo(97.58f, 80.0f)
                horizontalLineToRelative(60.84f)
                lineToRelative(-13.1f, 72.0f)
                close()
                moveTo(40.0f, 80.0f)
                lineTo(81.32f, 80.0f)
                lineToRelative(13.09f, 72.0f)
                lineTo(66.18f, 152.0f)
                close()
                moveTo(189.82f, 152.0f)
                lineTo(161.59f, 152.0f)
                lineToRelative(13.09f, -72.0f)
                lineTo(216.0f, 80.0f)
                close()
            }
        }
        .build()
        return `_air-traffic-control-duotone`!!
    }

private var `_air-traffic-control-duotone`: ImageVector? = null
