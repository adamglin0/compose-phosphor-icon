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

public val BoldGroup.`Package-bold`: ImageVector
    get() {
        if (`_package-bold` != null) {
            return `_package-bold`!!
        }
        `_package-bold` = Builder(name = "Package-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.6f, 62.64f)
                lineToRelative(-88.0f, -48.17f)
                arcToRelative(19.91f, 19.91f, 0.0f, false, false, -19.2f, 0.0f)
                lineToRelative(-88.0f, 48.17f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 80.19f)
                verticalLineToRelative(95.62f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 10.4f, 17.55f)
                lineToRelative(88.0f, 48.17f)
                arcToRelative(19.89f, 19.89f, 0.0f, false, false, 19.2f, 0.0f)
                lineToRelative(88.0f, -48.17f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 236.0f, 175.81f)
                lineTo(236.0f, 80.19f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 225.6f, 62.64f)
                close()
                moveTo(128.0f, 36.57f)
                lineTo(200.0f, 76.0f)
                lineTo(178.57f, 87.73f)
                lineToRelative(-72.0f, -39.42f)
                close()
                moveTo(128.0f, 115.4f)
                lineTo(56.0f, 76.0f)
                lineTo(81.56f, 62.0f)
                lineToRelative(72.0f, 39.41f)
                close()
                moveTo(44.0f, 96.79f)
                lineToRelative(72.0f, 39.4f)
                verticalLineToRelative(76.67f)
                lineTo(44.0f, 173.44f)
                close()
                moveTo(140.0f, 212.86f)
                lineTo(140.0f, 136.19f)
                lineToRelative(24.0f, -13.13f)
                lineTo(164.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(188.0f, 109.92f)
                lineToRelative(24.0f, -13.13f)
                verticalLineToRelative(76.65f)
                close()
            }
        }
        .build()
        return `_package-bold`!!
    }

private var `_package-bold`: ImageVector? = null
