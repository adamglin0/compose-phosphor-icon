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

public val DuotoneGroup.`Rug-duotone`: ImageVector
    get() {
        if (`_rug-duotone` != null) {
            return `_rug-duotone`!!
        }
        `_rug-duotone` = Builder(name = "Rug-duotone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(56.0f, 48.0f)
                lineTo(56.0f, 208.0f)
                lineTo(200.0f, 208.0f)
                lineTo(200.0f, 48.0f)
                close()
                moveTo(128.0f, 168.0f)
                lineTo(104.0f, 128.0f)
                lineTo(128.0f, 88.0f)
                lineTo(152.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(192.0f, 40.0f)
                lineTo(160.0f, 40.0f)
                lineTo(160.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(144.0f, 40.0f)
                lineTo(112.0f, 40.0f)
                lineTo(112.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(96.0f, 40.0f)
                lineTo(64.0f, 40.0f)
                lineTo(64.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(48.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(64.0f, 216.0f)
                lineTo(96.0f, 216.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(112.0f, 216.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(160.0f, 216.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(208.0f, 24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 16.0f)
                close()
                moveTo(192.0f, 200.0f)
                lineTo(64.0f, 200.0f)
                lineTo(64.0f, 56.0f)
                lineTo(192.0f, 56.0f)
                close()
                moveTo(121.14f, 172.12f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.72f, 0.0f)
                lineToRelative(24.0f, -40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -8.24f)
                lineToRelative(-24.0f, -40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.72f, 0.0f)
                lineToRelative(-24.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 8.24f)
                close()
                moveTo(128.0f, 103.55f)
                lineTo(142.67f, 128.0f)
                lineTo(128.0f, 152.45f)
                lineTo(113.33f, 128.0f)
                close()
            }
        }
        .build()
        return `_rug-duotone`!!
    }

private var `_rug-duotone`: ImageVector? = null
