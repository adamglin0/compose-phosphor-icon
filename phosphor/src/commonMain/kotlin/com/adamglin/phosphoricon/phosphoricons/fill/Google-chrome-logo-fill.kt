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

public val FillGroup.`Google-chrome-logo-fill`: ImageVector
    get() {
        if (`_google-chrome-logo-fill` != null) {
            return `_google-chrome-logo-fill`!!
        }
        `_google-chrome-logo-fill` = Builder(name = "Google-chrome-logo-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 40.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, 73.72f, 40.0f)
                lineTo(128.0f, 80.0f)
                arcToRelative(48.08f, 48.08f, 0.0f, false, false, -45.6f, 33.0f)
                lineToRelative(-23.08f, -40.0f)
                arcTo(87.89f, 87.89f, 0.0f, false, true, 128.0f, 40.0f)
                close()
                moveTo(40.0f, 128.0f)
                arcToRelative(87.44f, 87.44f, 0.0f, false, true, 9.56f, -39.86f)
                lineTo(86.43f, 152.0f)
                curveToRelative(0.06f, 0.1f, 0.13f, 0.19f, 0.19f, 0.28f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 137.82f, 175.0f)
                lineToRelative(-23.1f, 40.0f)
                arcTo(88.14f, 88.14f, 0.0f, false, true, 40.0f, 128.0f)
                close()
                moveTo(132.69f, 215.87f)
                lineTo(169.57f, 152.0f)
                curveToRelative(0.08f, -0.14f, 0.14f, -0.28f, 0.22f, -0.42f)
                arcToRelative(47.88f, 47.88f, 0.0f, false, false, -6.0f, -55.58f)
                lineTo(210.0f, 96.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, -77.29f, 119.87f)
                close()
            }
        }
        .build()
        return `_google-chrome-logo-fill`!!
    }

private var `_google-chrome-logo-fill`: ImageVector? = null
