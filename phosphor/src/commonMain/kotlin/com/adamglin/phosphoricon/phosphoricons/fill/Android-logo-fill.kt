package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Android-logo-fill`: ImageVector
    get() {
        if (`_android-logo-fill` != null) {
            return `_android-logo-fill`!!
        }
        `_android-logo-fill` = Builder(name = "Android-logo-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(207.06f, 80.67f)
                curveToRelative(-0.74f, -0.74f, -1.49f, -1.46f, -2.24f, -2.17f)
                lineToRelative(24.84f, -24.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                lineToRelative(-26.0f, 26.0f)
                arcToRelative(111.43f, 111.43f, 0.0f, false, false, -128.55f, 0.19f)
                lineTo(37.66f, 42.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 26.34f, 53.66f)
                lineTo(51.4f, 78.72f)
                arcTo(113.38f, 113.38f, 0.0f, false, false, 16.0f, 161.13f)
                lineTo(16.0f, 184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(224.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(240.0f, 160.0f)
                arcTo(111.25f, 111.25f, 0.0f, false, false, 207.06f, 80.67f)
                close()
                moveTo(92.0f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 92.0f, 160.0f)
                close()
                moveTo(164.0f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 160.0f)
                close()
            }
        }
        .build()
        return `_android-logo-fill`!!
    }

private var `_android-logo-fill`: ImageVector? = null
