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

public val DuotoneGroup.`Lamp-duotone`: ImageVector
    get() {
        if (`_lamp-duotone` != null) {
            return `_lamp-duotone`!!
        }
        `_lamp-duotone` = Builder(name = "Lamp-duotone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(240.0f, 152.0f)
                horizontalLineTo(16.0f)
                lineTo(64.0f, 40.0f)
                horizontalLineTo(192.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.35f, 148.85f)
                lineToRelative(-48.0f, -112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 32.0f)
                horizontalLineTo(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.35f, 4.85f)
                lineToRelative(-48.0f, 112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 16.0f, 160.0f)
                horizontalLineTo(120.0f)
                verticalLineToRelative(48.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(136.0f)
                verticalLineTo(160.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(160.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.35f, -11.15f)
                close()
                moveTo(28.13f, 144.0f)
                lineTo(69.28f, 48.0f)
                horizontalLineTo(186.72f)
                lineToRelative(41.15f, 96.0f)
                close()
            }
        }
        .build()
        return `_lamp-duotone`!!
    }

private var `_lamp-duotone`: ImageVector? = null
