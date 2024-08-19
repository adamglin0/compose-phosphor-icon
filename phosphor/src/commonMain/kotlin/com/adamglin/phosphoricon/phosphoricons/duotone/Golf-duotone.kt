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

public val DuotoneGroup.`Golf-duotone`: ImageVector
    get() {
        if (`_golf-duotone` != null) {
            return `_golf-duotone`!!
        }
        `_golf-duotone` = Builder(name = "Golf-duotone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 96.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, -80.0f, -80.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 208.0f, 96.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 100.0f)
                close()
                moveTo(132.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 132.0f, 120.0f)
                close()
                moveTo(216.0f, 96.0f)
                arcTo(88.0f, 88.0f, 0.0f, true, true, 128.0f, 8.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 216.0f, 96.0f)
                close()
                moveTo(200.0f, 96.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, false, -72.0f, 72.0f)
                arcTo(72.08f, 72.08f, 0.0f, false, false, 200.0f, 96.0f)
                close()
                moveTo(165.14f, 192.53f)
                curveTo(152.0f, 197.56f, 139.85f, 200.0f, 128.0f, 200.0f)
                reflectiveCurveToRelative(-24.0f, -2.44f, -37.14f, -7.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -5.72f, 14.94f)
                arcTo(125.91f, 125.91f, 0.0f, false, false, 120.0f, 215.68f)
                lineTo(120.0f, 248.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 215.68f)
                arcToRelative(125.91f, 125.91f, 0.0f, false, false, 34.86f, -8.21f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -5.72f, -14.94f)
                close()
            }
        }
        .build()
        return `_golf-duotone`!!
    }

private var `_golf-duotone`: ImageVector? = null
