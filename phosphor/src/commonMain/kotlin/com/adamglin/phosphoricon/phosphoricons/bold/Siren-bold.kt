package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Siren-bold`: ImageVector
    get() {
        if (`_siren-bold` != null) {
            return `_siren-bold`!!
        }
        `_siren-bold` = Builder(name = "Siren-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 20.0f)
                lineTo(116.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(200.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.49f, -3.51f)
                lineToRelative(8.0f, -8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, -17.0f)
                lineToRelative(-8.0f, 8.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 200.0f, 56.0f)
                close()
                moveTo(47.51f, 52.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, -17.0f)
                lineToRelative(-8.0f, -8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                close()
                moveTo(236.0f, 176.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(40.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(20.0f, 176.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 16.0f, -19.6f)
                lineTo(36.0f, 140.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, 92.0f, -92.0f)
                horizontalLineToRelative(0.71f)
                curveTo(179.0f, 48.38f, 220.0f, 90.1f, 220.0f, 141.0f)
                verticalLineToRelative(15.4f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 236.0f, 176.0f)
                close()
                moveTo(60.0f, 140.0f)
                verticalLineToRelative(16.0f)
                lineTo(196.0f, 156.0f)
                lineTo(196.0f, 141.0f)
                curveToRelative(0.0f, -37.77f, -30.27f, -68.72f, -67.48f, -69.0f)
                lineTo(128.0f, 72.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -68.0f, 68.0f)
                close()
                moveTo(212.0f, 180.0f)
                lineTo(44.0f, 180.0f)
                verticalLineToRelative(16.0f)
                lineTo(212.0f, 196.0f)
                close()
                moveTo(136.4f, 113.28f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 18.32f, 18.32f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 22.9f, -7.2f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -34.0f, -34.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.2f, 22.9f)
                close()
            }
        }
        .build()
        return `_siren-bold`!!
    }

private var `_siren-bold`: ImageVector? = null
