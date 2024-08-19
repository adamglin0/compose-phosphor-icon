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

public val BoldGroup.`Sign-out-bold`: ImageVector
    get() {
        if (`_sign-out-bold` != null) {
            return `_sign-out-bold`!!
        }
        `_sign-out-bold` = Builder(name = "Sign-out-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(48.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(36.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 48.0f, 28.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(60.0f, 52.0f)
                lineTo(60.0f, 204.0f)
                horizontalLineToRelative(52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 124.0f, 216.0f)
                close()
                moveTo(232.49f, 119.51f)
                lineTo(192.49f, 79.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineTo(195.0f, 116.0f)
                lineTo(112.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(83.0f)
                lineToRelative(-19.52f, 19.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                lineToRelative(40.0f, -40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 232.49f, 119.51f)
                close()
            }
        }
        .build()
        return `_sign-out-bold`!!
    }

private var `_sign-out-bold`: ImageVector? = null
