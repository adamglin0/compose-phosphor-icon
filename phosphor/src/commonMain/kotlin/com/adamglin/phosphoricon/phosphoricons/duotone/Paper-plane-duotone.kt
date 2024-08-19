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

public val DuotoneGroup.`Paper-plane-duotone`: ImageVector
    get() {
        if (`_paper-plane-duotone` != null) {
            return `_paper-plane-duotone`!!
        }
        `_paper-plane-duotone` = Builder(name = "Paper-plane-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(221.28f, 215.51f)
                lineTo(128.0f, 184.0f)
                lineTo(34.72f, 215.51f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.67f, -11.44f)
                lineToRelative(95.85f, -168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.0f, 0.0f)
                lineToRelative(96.09f, 168.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 221.28f, 215.51f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.9f, 200.1f)
                lineTo(141.85f, 32.18f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -27.89f, 0.0f)
                lineToRelative(-95.89f, 168.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 19.26f, 22.92f)
                lineTo(128.0f, 192.45f)
                lineToRelative(90.67f, 30.63f)
                arcTo(16.22f, 16.22f, 0.0f, false, false, 224.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.86f, -23.9f)
                close()
                moveTo(223.85f, 207.94f)
                lineTo(136.0f, 178.26f)
                lineTo(136.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(58.26f)
                lineTo(32.16f, 207.94f)
                lineTo(32.0f, 208.0f)
                lineTo(127.86f, 40.0f)
                lineTo(224.0f, 208.0f)
                close()
            }
        }
        .build()
        return `_paper-plane-duotone`!!
    }

private var `_paper-plane-duotone`: ImageVector? = null
