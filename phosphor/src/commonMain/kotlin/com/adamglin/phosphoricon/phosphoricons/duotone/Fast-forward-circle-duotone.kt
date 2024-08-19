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

public val DuotoneGroup.`Fast-forward-circle-duotone`: ImageVector
    get() {
        if (`_fast-forward-circle-duotone` != null) {
            return `_fast-forward-circle-duotone`!!
        }
        `_fast-forward-circle-duotone` = Builder(name = "Fast-forward-circle-duotone", defaultWidth
                = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 32.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, 96.0f, 96.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, false, 128.0f, 32.0f)
                close()
                moveTo(80.0f, 164.0f)
                lineTo(80.0f, 92.0f)
                lineToRelative(48.0f, 36.0f)
                close()
                moveTo(144.0f, 164.0f)
                lineTo(144.0f, 92.0f)
                lineToRelative(48.0f, 36.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 88.0f, -88.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 128.0f, 216.0f)
                close()
                moveTo(196.8f, 121.6f)
                lineTo(148.8f, 85.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 136.0f, 92.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.8f, 6.4f)
                lineToRelative(48.0f, -36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -12.8f)
                close()
                moveTo(152.0f, 148.0f)
                lineTo(152.0f, 108.0f)
                lineToRelative(26.67f, 20.0f)
                close()
                moveTo(132.8f, 121.6f)
                lineTo(84.8f, 85.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 92.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.8f, 6.4f)
                lineToRelative(48.0f, -36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -12.8f)
                close()
                moveTo(88.0f, 148.0f)
                lineTo(88.0f, 108.0f)
                lineToRelative(26.67f, 20.0f)
                close()
            }
        }
        .build()
        return `_fast-forward-circle-duotone`!!
    }

private var `_fast-forward-circle-duotone`: ImageVector? = null
