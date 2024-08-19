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

public val ThinGroup.`Bathtub-thin`: ImageVector
    get() {
        if (`_bathtub-thin` != null) {
            return `_bathtub-thin`!!
        }
        `_bathtub-thin` = Builder(name = "Bathtub-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 100.0f)
                lineTo(204.0f, 100.0f)
                lineTo(204.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(136.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(4.0f)
                lineTo(60.0f, 100.0f)
                lineTo(60.0f, 52.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 76.0f, 36.0f)
                arcTo(16.49f, 16.49f, 0.0f, false, true, 92.08f, 48.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 7.84f, -1.6f)
                arcTo(24.32f, 24.32f, 0.0f, false, false, 76.0f, 28.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 52.0f, 52.0f)
                verticalLineToRelative(48.0f)
                lineTo(16.0f, 100.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, false, 52.0f, 52.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(76.0f, 196.0f)
                lineTo(180.0f, 196.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(188.0f, 196.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, false, 52.0f, -52.0f)
                lineTo(244.0f, 104.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 240.0f, 100.0f)
                close()
                moveTo(140.0f, 100.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(40.0f)
                lineTo(140.0f, 140.0f)
                close()
                moveTo(236.0f, 144.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, 44.0f)
                lineTo(64.0f, 188.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, -44.0f)
                lineTo(20.0f, 108.0f)
                lineTo(132.0f, 108.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(204.0f, 108.0f)
                horizontalLineToRelative(32.0f)
                close()
            }
        }
        .build()
        return `_bathtub-thin`!!
    }

private var `_bathtub-thin`: ImageVector? = null
