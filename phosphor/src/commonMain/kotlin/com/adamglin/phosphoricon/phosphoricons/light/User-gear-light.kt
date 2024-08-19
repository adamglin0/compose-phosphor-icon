package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`User-gear-light`: ImageVector
    get() {
        if (`_user-gear-light` != null) {
            return `_user-gear-light`!!
        }
        `_user-gear-light` = Builder(name = "User-gear-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(139.0f, 158.25f)
                arcToRelative(66.0f, 66.0f, 0.0f, true, false, -62.0f, 0.0f)
                curveToRelative(-22.0f, 6.23f, -41.88f, 19.16f, -57.61f, 37.89f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.18f, 7.72f)
                curveTo(49.1f, 179.44f, 77.31f, 166.0f, 108.0f, 166.0f)
                reflectiveCurveToRelative(58.9f, 13.44f, 79.41f, 37.86f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 9.18f, -7.72f)
                curveTo(180.86f, 177.41f, 161.0f, 164.48f, 139.0f, 158.25f)
                close()
                moveTo(54.0f, 100.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, true, true, 54.0f, 54.0f)
                arcTo(54.06f, 54.06f, 0.0f, false, true, 54.0f, 100.0f)
                close()
                moveTo(251.25f, 144.8f)
                lineTo(245.33f, 141.39f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, -10.78f)
                lineToRelative(5.92f, -3.41f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -10.4f)
                lineToRelative(-5.93f, 3.43f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -9.32f, -5.39f)
                lineTo(230.0f, 108.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(6.84f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -9.32f, 5.39f)
                lineToRelative(-5.93f, -3.43f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 10.4f)
                lineToRelative(5.92f, 3.41f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, 10.78f)
                lineToRelative(-5.92f, 3.41f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 10.4f)
                lineToRelative(5.93f, -3.43f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 9.32f, 5.39f)
                lineTo(218.0f, 164.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineToRelative(-6.84f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 9.32f, -5.39f)
                lineToRelative(5.93f, 3.43f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -10.4f)
                close()
                moveTo(224.0f, 146.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 224.0f, 146.0f)
                close()
            }
        }
        .build()
        return `_user-gear-light`!!
    }

private var `_user-gear-light`: ImageVector? = null
