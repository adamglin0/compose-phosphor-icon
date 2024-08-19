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

public val BoldGroup.`Standard-definition-bold`: ImageVector
    get() {
        if (`_standard-definition-bold` != null) {
            return `_standard-definition-bold`!!
        }
        `_standard-definition-bold` = Builder(name = "Standard-definition-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 68.0f)
                lineTo(148.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 0.0f, -120.0f)
                close()
                moveTo(172.0f, 164.0f)
                lineTo(160.0f, 164.0f)
                lineTo(160.0f, 92.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, 72.0f)
                close()
                moveTo(20.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 32.0f, 32.0f)
                lineTo(224.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(32.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 20.0f, 44.0f)
                close()
                moveTo(236.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(32.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(224.0f, 200.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 236.0f, 212.0f)
                close()
                moveTo(96.0f, 152.0f)
                curveToRelative(0.0f, -6.37f, -6.29f, -9.32f, -24.0f, -14.42f)
                curveToRelative(-16.14f, -4.65f, -38.23f, -11.0f, -38.23f, -33.58f)
                curveToRelative(0.0f, -20.52f, 18.15f, -36.0f, 42.22f, -36.0f)
                curveToRelative(17.24f, 0.0f, 32.06f, 8.14f, 38.69f, 21.24f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -21.41f, 10.84f)
                curveTo(90.8f, 95.17f, 84.0f, 92.0f, 76.0f, 92.0f)
                curveToRelative(-10.22f, 0.0f, -18.22f, 5.27f, -18.22f, 12.0f)
                curveToRelative(0.0f, 1.09f, 0.0f, 2.21f, 3.28f, 4.17f)
                curveToRelative(4.18f, 2.48f, 11.0f, 4.45f, 17.6f, 6.35f)
                curveToRelative(8.75f, 2.52f, 17.8f, 5.13f, 25.38f, 9.86f)
                curveToRelative(13.19f, 8.23f, 16.0f, 19.56f, 16.0f, 27.62f)
                curveToRelative(0.0f, 20.19f, -19.33f, 36.0f, -44.0f, 36.0f)
                reflectiveCurveToRelative(-44.0f, -15.81f, -44.0f, -36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                curveToRelative(0.0f, 6.87f, 10.56f, 12.0f, 20.0f, 12.0f)
                reflectiveCurveTo(96.0f, 158.87f, 96.0f, 152.0f)
                close()
            }
        }
        .build()
        return `_standard-definition-bold`!!
    }

private var `_standard-definition-bold`: ImageVector? = null
