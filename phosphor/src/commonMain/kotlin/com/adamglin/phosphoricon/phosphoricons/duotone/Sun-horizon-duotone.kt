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

public val DuotoneGroup.`Sun-horizon-duotone`: ImageVector
    get() {
        if (`_sun-horizon-duotone` != null) {
            return `_sun-horizon-duotone`!!
        }
        `_sun-horizon-duotone` = Builder(name = "Sun-horizon-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(192.0f, 144.0f)
                arcToRelative(64.33f, 64.33f, 0.0f, false, true, -2.0f, 16.0f)
                horizontalLineTo(66.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 126.0f, -16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 152.0f)
                lineTo(199.55f, 152.0f)
                arcToRelative(73.54f, 73.54f, 0.0f, false, false, 0.45f, -8.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, -144.0f, 0.0f)
                arcToRelative(73.54f, 73.54f, 0.0f, false, false, 0.45f, 8.0f)
                lineTo(16.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(240.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(72.0f, 144.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 111.41f, 8.0f)
                lineTo(72.59f, 152.0f)
                arcTo(56.13f, 56.13f, 0.0f, false, true, 72.0f, 144.0f)
                close()
                moveTo(216.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(48.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(208.0f, 192.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 200.0f)
                close()
                moveTo(72.84f, 43.58f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.32f, -7.16f)
                lineToRelative(8.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.32f, 7.16f)
                close()
                moveTo(16.84f, 92.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.74f, -3.57f)
                lineToRelative(16.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.16f, 14.31f)
                lineToRelative(-16.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 16.84f, 92.42f)
                close()
                moveTo(208.84f, 107.58f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.58f, -10.73f)
                lineToRelative(16.0f, -8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 7.16f, 14.31f)
                lineToRelative(-16.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.74f, -3.58f)
                close()
                moveTo(160.84f, 52.42f)
                lineTo(168.84f, 36.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.32f, 7.16f)
                lineToRelative(-8.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -14.32f, -7.16f)
                close()
            }
        }
        .build()
        return `_sun-horizon-duotone`!!
    }

private var `_sun-horizon-duotone`: ImageVector? = null
