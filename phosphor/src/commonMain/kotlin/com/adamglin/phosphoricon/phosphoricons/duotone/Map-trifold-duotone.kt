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

public val DuotoneGroup.`Map-trifold-duotone`: ImageVector
    get() {
        if (`_map-trifold-duotone` != null) {
            return `_map-trifold-duotone`!!
        }
        `_map-trifold-duotone` = Builder(name = "Map-trifold-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(160.0f, 72.0f)
                verticalLineTo(216.0f)
                lineTo(96.0f, 184.0f)
                verticalLineTo(40.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.92f, 49.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.86f, -1.45f)
                lineTo(160.93f, 63.52f)
                lineTo(99.58f, 32.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.52f, -0.6f)
                lineToRelative(-64.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 24.0f, 56.0f)
                lineTo(24.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.94f, 7.76f)
                lineToRelative(61.13f, -15.28f)
                lineToRelative(61.35f, 30.68f)
                arcTo(8.15f, 8.15f, 0.0f, false, false, 160.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.94f, -0.24f)
                lineToRelative(64.0f, -16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 200.0f)
                lineTo(232.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 228.92f, 49.69f)
                close()
                moveTo(104.0f, 52.94f)
                lineToRelative(48.0f, 24.0f)
                lineTo(152.0f, 203.06f)
                lineToRelative(-48.0f, -24.0f)
                close()
                moveTo(40.0f, 62.25f)
                lineToRelative(48.0f, -12.0f)
                verticalLineToRelative(127.5f)
                lineToRelative(-48.0f, 12.0f)
                close()
                moveTo(216.0f, 193.75f)
                lineTo(168.0f, 205.75f)
                lineTo(168.0f, 78.25f)
                lineToRelative(48.0f, -12.0f)
                close()
            }
        }
        .build()
        return `_map-trifold-duotone`!!
    }

private var `_map-trifold-duotone`: ImageVector? = null
