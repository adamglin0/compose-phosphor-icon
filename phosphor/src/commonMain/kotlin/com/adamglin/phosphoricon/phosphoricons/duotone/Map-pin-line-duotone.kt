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

public val DuotoneGroup.`Map-pin-line-duotone`: ImageVector
    get() {
        if (`_map-pin-line-duotone` != null) {
            return `_map-pin-line-duotone`!!
        }
        `_map-pin-line-duotone` = Builder(name = "Map-pin-line-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, -80.0f, 80.0f)
                curveToRelative(0.0f, 72.0f, 80.0f, 128.0f, 80.0f, 128.0f)
                reflectiveCurveToRelative(80.0f, -56.0f, 80.0f, -128.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 136.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 136.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 224.0f)
                lineTo(150.54f, 224.0f)
                arcTo(266.56f, 266.56f, 0.0f, false, false, 174.0f, 200.25f)
                curveToRelative(27.45f, -31.57f, 42.0f, -64.85f, 42.0f, -96.25f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, -176.0f, 0.0f)
                curveToRelative(0.0f, 31.4f, 14.51f, 64.68f, 42.0f, 96.25f)
                arcTo(266.56f, 266.56f, 0.0f, false, false, 105.46f, 224.0f)
                lineTo(56.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(200.0f, 240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(56.0f, 104.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, 144.0f, 0.0f)
                curveToRelative(0.0f, 57.23f, -55.47f, 105.0f, -72.0f, 118.0f)
                curveTo(111.47f, 209.0f, 56.0f, 161.23f, 56.0f, 104.0f)
                close()
                moveTo(168.0f, 104.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -40.0f, 40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 168.0f, 104.0f)
                close()
                moveTo(104.0f, 104.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 104.0f, 104.0f)
                close()
            }
        }
        .build()
        return `_map-pin-line-duotone`!!
    }

private var `_map-pin-line-duotone`: ImageVector? = null
