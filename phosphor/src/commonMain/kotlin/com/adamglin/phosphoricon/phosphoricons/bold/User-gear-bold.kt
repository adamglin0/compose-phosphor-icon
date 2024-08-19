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

public val BoldGroup.`User-gear-bold`: ImageVector
    get() {
        if (`_user-gear-bold` != null) {
            return `_user-gear-bold`!!
        }
        `_user-gear-bold` = Builder(name = "User-gear-bold", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.5f, 156.53f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, false, -89.0f, 0.0f)
                arcToRelative(124.0f, 124.0f, 0.0f, false, false, -48.69f, 35.75f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 18.38f, 15.44f)
                curveTo(48.54f, 184.69f, 75.11f, 172.0f, 104.0f, 172.0f)
                curveToRelative(37.0f, 0.0f, 61.12f, 19.42f, 74.81f, 35.72f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 18.38f, -15.44f)
                arcTo(124.0f, 124.0f, 0.0f, false, false, 148.5f, 156.53f)
                close()
                moveTo(56.0f, 100.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 48.0f, 48.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 56.0f, 100.0f)
                close()
                moveTo(246.53f, 140.0f)
                lineTo(239.42f, 142.31f)
                lineTo(243.81f, 148.36f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -19.41f, 14.11f)
                lineToRelative(-4.4f, -6.06f)
                lineToRelative(-4.4f, 6.06f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -19.41f, -14.11f)
                lineToRelative(4.39f, -6.05f)
                lineTo(193.47f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 7.41f, -22.83f)
                lineToRelative(7.12f, 2.31f)
                lineTo(208.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(7.48f)
                lineToRelative(7.12f, -2.31f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 246.53f, 140.0f)
                close()
            }
        }
        .build()
        return `_user-gear-bold`!!
    }

private var `_user-gear-bold`: ImageVector? = null
