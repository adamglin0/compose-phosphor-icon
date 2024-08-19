package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Three-d-thin`: ImageVector
    get() {
        if (`_three-d-thin` != null) {
            return `_three-d-thin`!!
        }
        `_three-d-thin` = Builder(name = "Three-d-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 148.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, -24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.28f, -6.29f)
                lineTo(96.32f, 84.0f)
                lineTo(56.0f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.28f, 6.29f)
                lineTo(83.12f, 116.8f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -30.0f, 53.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.72f, -5.6f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 100.0f, 148.0f)
                close()
                moveTo(160.0f, 76.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 0.0f, 104.0f)
                lineTo(136.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(132.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                close()
                moveTo(160.0f, 84.0f)
                lineTo(140.0f, 84.0f)
                verticalLineToRelative(88.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 0.0f, -88.0f)
                close()
                moveTo(32.0f, 52.0f)
                lineTo(224.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(32.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
                moveTo(224.0f, 204.0f)
                lineTo(32.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(224.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
            }
        }
        .build()
        return `_three-d-thin`!!
    }

private var `_three-d-thin`: ImageVector? = null
