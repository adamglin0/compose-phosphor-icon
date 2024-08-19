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

public val DuotoneGroup.`Headlights-duotone`: ImageVector
    get() {
        if (`_headlights-duotone` != null) {
            return `_headlights-duotone`!!
        }
        `_headlights-duotone` = Builder(name = "Headlights-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(136.0f, 64.0f)
                verticalLineTo(192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(88.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, -72.0f, -72.55f)
                curveTo(16.3f, 87.75f, 49.2f, 56.0f, 88.9f, 56.0f)
                horizontalLineTo(128.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(168.0f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 80.0f)
                close()
                moveTo(240.0f, 168.0f)
                lineTo(168.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(240.0f, 104.0f)
                lineTo(168.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(240.0f, 136.0f)
                lineTo(168.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(144.0f, 64.0f)
                lineTo(144.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(88.0f, 208.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 8.0f, 127.39f)
                curveTo(8.33f, 83.62f, 44.62f, 48.0f, 88.9f, 48.0f)
                lineTo(128.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 144.0f, 64.0f)
                close()
                moveTo(128.0f, 64.0f)
                lineTo(88.9f, 64.0f)
                curveTo(53.38f, 64.0f, 24.26f, 92.49f, 24.0f, 127.51f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 88.0f, 192.0f)
                horizontalLineToRelative(40.0f)
                close()
            }
        }
        .build()
        return `_headlights-duotone`!!
    }

private var `_headlights-duotone`: ImageVector? = null
