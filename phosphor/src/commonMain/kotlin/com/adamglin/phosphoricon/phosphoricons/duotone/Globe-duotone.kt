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

public val DuotoneGroup.`Globe-duotone`: ImageVector
    get() {
        if (`_globe-duotone` != null) {
            return `_globe-duotone`!!
        }
        `_globe-duotone` = Builder(name = "Globe-duotone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, -96.0f, -96.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 224.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                horizontalLineToRelative(0.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.12f, 104.12f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(216.0f, 128.0f)
                arcToRelative(87.61f, 87.61f, 0.0f, false, true, -3.33f, 24.0f)
                lineTo(174.16f, 152.0f)
                arcToRelative(157.44f, 157.44f, 0.0f, false, false, 0.0f, -48.0f)
                horizontalLineToRelative(38.51f)
                arcTo(87.61f, 87.61f, 0.0f, false, true, 216.0f, 128.0f)
                close()
                moveTo(102.0f, 168.0f)
                lineTo(154.0f, 168.0f)
                arcToRelative(115.11f, 115.11f, 0.0f, false, true, -26.0f, 45.0f)
                arcTo(115.27f, 115.27f, 0.0f, false, true, 102.0f, 168.0f)
                close()
                moveTo(98.1f, 152.0f)
                arcToRelative(140.84f, 140.84f, 0.0f, false, true, 0.0f, -48.0f)
                horizontalLineToRelative(59.88f)
                arcToRelative(140.84f, 140.84f, 0.0f, false, true, 0.0f, 48.0f)
                close()
                moveTo(40.0f, 128.0f)
                arcToRelative(87.61f, 87.61f, 0.0f, false, true, 3.33f, -24.0f)
                lineTo(81.84f, 104.0f)
                arcToRelative(157.44f, 157.44f, 0.0f, false, false, 0.0f, 48.0f)
                lineTo(43.33f, 152.0f)
                arcTo(87.61f, 87.61f, 0.0f, false, true, 40.0f, 128.0f)
                close()
                moveTo(154.0f, 88.0f)
                lineTo(102.0f, 88.0f)
                arcToRelative(115.11f, 115.11f, 0.0f, false, true, 26.0f, -45.0f)
                arcTo(115.27f, 115.27f, 0.0f, false, true, 154.0f, 88.0f)
                close()
                moveTo(206.33f, 88.0f)
                lineTo(170.71f, 88.0f)
                arcToRelative(135.28f, 135.28f, 0.0f, false, false, -22.3f, -45.6f)
                arcTo(88.29f, 88.29f, 0.0f, false, true, 206.37f, 88.0f)
                close()
                moveTo(107.59f, 42.4f)
                arcTo(135.28f, 135.28f, 0.0f, false, false, 85.29f, 88.0f)
                lineTo(49.63f, 88.0f)
                arcTo(88.29f, 88.29f, 0.0f, false, true, 107.59f, 42.4f)
                close()
                moveTo(49.63f, 168.0f)
                lineTo(85.29f, 168.0f)
                arcToRelative(135.28f, 135.28f, 0.0f, false, false, 22.3f, 45.6f)
                arcTo(88.29f, 88.29f, 0.0f, false, true, 49.63f, 168.0f)
                close()
                moveTo(148.41f, 213.6f)
                arcToRelative(135.28f, 135.28f, 0.0f, false, false, 22.3f, -45.6f)
                horizontalLineToRelative(35.66f)
                arcTo(88.29f, 88.29f, 0.0f, false, true, 148.41f, 213.6f)
                close()
            }
        }
        .build()
        return `_globe-duotone`!!
    }

private var `_globe-duotone`: ImageVector? = null
