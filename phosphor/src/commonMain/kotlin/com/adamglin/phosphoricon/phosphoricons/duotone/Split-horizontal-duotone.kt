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

public val DuotoneGroup.`Split-horizontal-duotone`: ImageVector
    get() {
        if (`_split-horizontal-duotone` != null) {
            return `_split-horizontal-duotone`!!
        }
        `_split-horizontal-duotone` = Builder(name = "Split-horizontal-duotone", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(232.0f, 128.0f)
                lineToRelative(-32.0f, 32.0f)
                verticalLineTo(96.0f)
                close()
                moveTo(56.0f, 160.0f)
                verticalLineTo(96.0f)
                lineTo(24.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(72.0f)
                lineTo(64.0f, 120.0f)
                lineTo(64.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.66f, -5.66f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.32f)
                lineToRelative(32.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 64.0f, 160.0f)
                lineTo(64.0f, 136.0f)
                lineTo(96.0f, 136.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(112.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 40.0f)
                close()
                moveTo(48.0f, 140.69f)
                lineTo(35.31f, 128.0f)
                lineTo(48.0f, 115.31f)
                close()
                moveTo(237.66f, 122.34f)
                lineTo(205.66f, 90.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 96.0f)
                verticalLineToRelative(24.0f)
                lineTo(160.0f, 120.0f)
                lineTo(160.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(144.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(160.0f, 136.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.66f, 5.66f)
                lineToRelative(32.0f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 237.66f, 122.34f)
                close()
                moveTo(208.0f, 140.69f)
                lineTo(208.0f, 115.31f)
                lineTo(220.69f, 128.0f)
                close()
            }
        }
        .build()
        return `_split-horizontal-duotone`!!
    }

private var `_split-horizontal-duotone`: ImageVector? = null
