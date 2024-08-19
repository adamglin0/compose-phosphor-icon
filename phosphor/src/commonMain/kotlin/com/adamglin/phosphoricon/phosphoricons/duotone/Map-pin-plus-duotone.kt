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

public val DuotoneGroup.`Map-pin-plus-duotone`: ImageVector
    get() {
        if (`_map-pin-plus-duotone` != null) {
            return `_map-pin-plus-duotone`!!
        }
        `_map-pin-plus-duotone` = Builder(name = "Map-pin-plus-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 104.0f)
                curveToRelative(0.0f, 72.0f, -80.0f, 128.0f, -80.0f, 128.0f)
                reflectiveCurveTo(48.0f, 176.0f, 48.0f, 104.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, 160.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 16.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, false, -88.0f, 88.0f)
                curveToRelative(0.0f, 31.4f, 14.51f, 64.68f, 42.0f, 96.25f)
                arcToRelative(254.19f, 254.19f, 0.0f, false, false, 41.45f, 38.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.18f, 0.0f)
                arcTo(254.19f, 254.19f, 0.0f, false, false, 174.0f, 200.25f)
                curveToRelative(27.45f, -31.57f, 42.0f, -64.85f, 42.0f, -96.25f)
                arcTo(88.1f, 88.1f, 0.0f, false, false, 128.0f, 16.0f)
                close()
                moveTo(128.0f, 222.0f)
                curveToRelative(-16.53f, -13.0f, -72.0f, -60.75f, -72.0f, -118.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, 144.0f, 0.0f)
                curveTo(200.0f, 161.23f, 144.53f, 209.0f, 128.0f, 222.0f)
                close()
                moveTo(168.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(136.0f, 112.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 112.0f)
                lineTo(96.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(24.0f)
                lineTo(120.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(136.0f, 96.0f)
                horizontalLineToRelative(24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 104.0f)
                close()
            }
        }
        .build()
        return `_map-pin-plus-duotone`!!
    }

private var `_map-pin-plus-duotone`: ImageVector? = null
