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

public val DuotoneGroup.`User-circle-check-duotone`: ImageVector
    get() {
        if (`_user-circle-check-duotone` != null) {
            return `_user-circle-check-duotone`!!
        }
        `_user-circle-check-duotone` = Builder(name = "User-circle-check-duotone", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                arcToRelative(95.76f, 95.76f, 0.0f, false, true, -31.8f, 71.37f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 128.0f, 160.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -40.0f, -40.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, -64.2f, 39.37f)
                horizontalLineToRelative(0.0f)
                arcTo(96.0f, 96.0f, 0.0f, true, true, 224.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.35f, 104.11f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.57f, 9.21f)
                arcTo(88.85f, 88.85f, 0.0f, false, true, 216.0f, 128.0f)
                arcToRelative(87.62f, 87.62f, 0.0f, false, true, -22.24f, 58.41f)
                arcToRelative(79.66f, 79.66f, 0.0f, false, false, -36.06f, -28.75f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -59.4f, 0.0f)
                arcToRelative(79.66f, 79.66f, 0.0f, false, false, -36.06f, 28.75f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 128.0f, 40.0f)
                arcToRelative(88.76f, 88.76f, 0.0f, false, true, 14.68f, 1.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.64f, -15.78f)
                arcToRelative(103.92f, 103.92f, 0.0f, true, false, 85.24f, 85.24f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 221.35f, 104.11f)
                close()
                moveTo(96.0f, 120.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 96.0f, 120.0f)
                close()
                moveTo(74.08f, 197.5f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 107.84f, 0.0f)
                arcToRelative(87.83f, 87.83f, 0.0f, false, true, -107.84f, 0.0f)
                close()
                moveTo(237.66f, 45.66f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(200.0f, 60.69f)
                lineToRelative(26.34f, -26.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                close()
            }
        }
        .build()
        return `_user-circle-check-duotone`!!
    }

private var `_user-circle-check-duotone`: ImageVector? = null
