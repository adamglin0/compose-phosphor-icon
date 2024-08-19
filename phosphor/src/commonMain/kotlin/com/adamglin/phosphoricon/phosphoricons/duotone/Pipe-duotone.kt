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

public val DuotoneGroup.`Pipe-duotone`: ImageVector
    get() {
        if (`_pipe-duotone` != null) {
            return `_pipe-duotone`!!
        }
        `_pipe-duotone` = Builder(name = "Pipe-duotone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(168.0f, 48.0f)
                verticalLineToRelative(64.0f)
                horizontalLineTo(144.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f)
                verticalLineToRelative(24.0f)
                horizontalLineTo(48.0f)
                verticalLineTo(144.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, 96.0f, -96.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 104.0f)
                lineTo(208.0f, 104.0f)
                lineTo(208.0f, 56.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(205.83f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 192.0f, 32.0f)
                lineTo(176.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -13.83f, 8.0f)
                lineTo(144.0f, 40.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 40.0f, 144.0f)
                verticalLineToRelative(18.16f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 176.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 8.0f, 13.84f)
                lineTo(40.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(56.0f, 208.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(120.0f, 205.84f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 128.0f, 192.0f)
                lineTo(128.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -8.0f, -13.84f)
                lineTo(120.0f, 144.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, -24.0f)
                horizontalLineToRelative(18.17f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 176.0f, 128.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.83f, -8.0f)
                lineTo(232.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(112.0f, 176.0f)
                verticalLineToRelative(16.0f)
                lineTo(48.0f, 192.0f)
                lineTo(48.0f, 176.0f)
                close()
                moveTo(104.0f, 144.0f)
                verticalLineToRelative(16.0f)
                lineTo(56.0f, 160.0f)
                lineTo(56.0f, 144.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, true, 88.0f, -88.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(48.0f)
                lineTo(144.0f, 104.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 104.0f, 144.0f)
                close()
                moveTo(176.0f, 112.0f)
                lineTo(176.0f, 48.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(63.8f)
                curveToRelative(0.0f, 0.07f, 0.0f, 0.13f, 0.0f, 0.2f)
                close()
            }
        }
        .build()
        return `_pipe-duotone`!!
    }

private var `_pipe-duotone`: ImageVector? = null
